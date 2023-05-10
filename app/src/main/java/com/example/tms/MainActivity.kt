package com.example.tms
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tms.ui.theme.TMSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TMSTheme {
                LoginScreen()
            }
        }
    }
}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
    fun LoginScreen() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Gray),
            Arrangement.Center

        ) {
            var username by rememberSaveable { mutableStateOf("") }
            var password by rememberSaveable { mutableStateOf("") }


            Image(painter = painterResource(id = R.drawable.logo1),
                  contentDescription = null,
                modifier = Modifier
                    .align(CenterHorizontally)
                    .size(150.dp),
            )

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 100.dp, start = 10.dp, end = 10.dp),
                value = username,
                maxLines = 1,
                onValueChange = {
                    username = it
                },
                label = { Text("Username")  }
            )

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp, start = 10.dp,
                        end = 10.dp, bottom = 50.dp),
                value = password,
                maxLines = 1,
                onValueChange = {
                    password = it
                },
                label = { Text("Password") }
            )

            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp, end = 100.dp),
                onClick = {

            }) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    text = "Login",
                    textAlign = TextAlign.Center
                )
            }
        }
}

