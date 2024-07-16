package com.example.horoscopapp.ui.home

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.horoscopapp.R
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
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


    }

    @Test
    fun `when_main_activity_is_created_then_open_LuckFragment`(){
        onView(withId(R.id.luckFragment)).perform(click())

    }
}