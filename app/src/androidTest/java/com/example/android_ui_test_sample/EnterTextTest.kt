package com.example.android_ui_test_sample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.pressImeActionButton
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class EnterTextTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testEnterText() {

        val text = "test"
        // InputFragmentでテキストを入力する
        onView(withId(R.id.inputText)).perform(replaceText(text))
            .perform(pressImeActionButton())

        // ResultFragmentに遷移後、テキストが正しく表示されていることを確認する
        onView(withId(R.id.resultText))
            .check(matches(withText(text)))

    }
}