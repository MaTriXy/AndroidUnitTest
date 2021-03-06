package com.github.florent37.testsample;

import com.github.florent37.androidunittest.AndroidUnitTest;
import com.github.florent37.androidunittest.annotations.RActivity;
import com.github.florent37.testsample.model.User;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(CustomTestRunner.class)
public class MainActivityTest {
    @Rule public AndroidUnitTest androidUnitTest = AndroidUnitTest.rule();

    @RActivity MainActivity activity;

    @Mock User user;

    @Test
    public void testDisplayUser() throws Exception {
        // Given
        given(user.getName()).willReturn("florent");
        // When
        activity.display(user);
        // Then
        assertThat(activity.textView.getText()).isEqualTo("florent");
    }

}
