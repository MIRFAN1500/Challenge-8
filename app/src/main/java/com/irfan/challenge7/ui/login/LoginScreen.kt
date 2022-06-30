package com.irfan.challenge7.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.irfan.challenge7.Screen

@Composable
fun LoginScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
    ) {
        Image(imageVector = Icons.Default.Home, contentDescription = null)
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.SignUp.route)
            },
            text = "Login"
        )
    }
}