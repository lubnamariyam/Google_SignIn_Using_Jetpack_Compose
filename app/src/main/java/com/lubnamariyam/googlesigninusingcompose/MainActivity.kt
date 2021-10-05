package com.lubnamariyam.googlesigninusingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lubnamariyam.googlesigninusingcompose.model.AuthViewModel
import com.lubnamariyam.googlesigninusingcompose.presentation.AuthScreen
import com.lubnamariyam.googlesigninusingcompose.presentation.AuthView
import com.lubnamariyam.googlesigninusingcompose.presentation.GoogleSignInButtonUi
import com.lubnamariyam.googlesigninusingcompose.ui.theme.GoogleSignInUsingComposeTheme
import kotlinx.coroutines.ExperimentalCoroutinesApi

class MainActivity : ComponentActivity() {
    @ExperimentalCoroutinesApi
    @ExperimentalFoundationApi
    @ExperimentalAnimationApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleSignInUsingComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    AuthScreen(AuthViewModel())
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GoogleSignInUsingComposeTheme {

    }
}