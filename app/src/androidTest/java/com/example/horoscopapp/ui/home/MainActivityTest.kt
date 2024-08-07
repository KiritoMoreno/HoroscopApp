package com.example.horoscopapp.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.horoscopapp.R
import com.example.horoscopapp.ui.detail.HoroscopeDetailActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class MainActivityTest{

    //Rules
    @get:Rule(order = 0)    // DaggerHilt it has to be first
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)  //
    var mainActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp(){
        hiltRule.inject()

        // Prepare the intents
        Intents.init()
    }

    @After
    fun tearDown(){
        Intents.release()
    }
    @Test
    fun `when_main_activity_is_created_then_open_LuckFragment`(){
        onView(withId(R.id.luckFragment)).perform(click())

    }

    /*
    "If we have an error, it could be due to the animations. Follow these steps:
    Go to Setting of the mobile (About)
    Click on Build Number (click 5 times until it says we are developers)
    Go to Developer Options
    Turn Off (Window animation scale, Transition animation scale, and Animator animation scale)"
     */
    @Test
    fun `when_horoscope_is_selected_then_open_detail`(){
        onView(withId(R.id.rvHoroscope)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0, click()
            )
        )
        intended(hasComponent(HoroscopeDetailActivity::class.java.name))
    }
}