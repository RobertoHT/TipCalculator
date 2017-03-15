package micromaster.beginner.com.tipcalculator;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by praxis on 15/03/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    private static final String BILL_AMOUNT = "100";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tipTotalAmount15percent(){
        onView(withId(R.id.etBillAmount)).perform(typeText(BILL_AMOUNT), closeSoftKeyboard());
        onView(withText("15.0% Tip Percent")).perform(click());
        String expectedText = "$115.0";
        onView(withId(R.id.tvBillTotalAmount)).check(matches(withText(expectedText)));
    }

    @Test
    public void tipTotalAmount20percent(){
        onView(withId(R.id.etBillAmount)).perform(typeText(BILL_AMOUNT), closeSoftKeyboard());
        onView(withText("20.0% Tip Percent")).perform(click());
        String expectedText = "$120.0";
        onView(withId(R.id.tvBillTotalAmount)).check(matches(withText(expectedText)));
    }

    @Test
    public void tipTotalAmount30percent(){
        onView(withId(R.id.etBillAmount)).perform(typeText(BILL_AMOUNT), closeSoftKeyboard());
        onView(withText("30.0% Tip Percent")).perform(click());
        String expectedText = "$130.0";
        onView(withId(R.id.tvBillTotalAmount)).check(matches(withText(expectedText)));
    }

    @Test
    public void tipTotalAmount40percent(){
        onView(withId(R.id.etBillAmount)).perform(typeText(BILL_AMOUNT), closeSoftKeyboard());
        onView(withText("40.0% Tip Percent")).perform(click());
        String expectedText = "$140.0";
        onView(withId(R.id.tvBillTotalAmount)).check(matches(withText(expectedText)));
    }
}