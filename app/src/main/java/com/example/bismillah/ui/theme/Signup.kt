package com.example.bismillah.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.bismillah.R

    @Composable
    fun SignupScreen(navController: NavHostController) {
        Column(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(android.graphics.Color.parseColor("#D5BDAF")))
        ) {
            val screenHeight = LocalConfiguration.current.screenHeightDp.dp
            Image(
                painter = painterResource(id = R.drawable.login_atas),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(screenHeight * 0.3f),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Create\nAccount",
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 16.dp, start = 24.dp),
                fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold
            )

            var text by rememberSaveable { mutableStateOf("") }

            TextField(
                value = text, onValueChange = { text = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.name), contentDescription = null,
                        modifier = Modifier
                            .size(43.dp)
                            .padding(start = 6.dp)
                            .padding(3.dp)
                    )
                },
                label = { Text(text = "Name") },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#F5EBE0")),
                    focusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                    unfocusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                    textColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                    unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e"))
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                    .background(androidx.compose.ui.graphics.Color.White, CircleShape)
            )
            TextField(
                value = text, onValueChange = { text = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.email), contentDescription = null,
                        modifier = Modifier
                            .size(43.dp)
                            .padding(start = 6.dp)
                            .padding(3.dp)
                    )
                },
                label = { Text(text = "Email") },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#F5EBE0")),
                    focusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                    unfocusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                    textColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                    unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e"))
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                    .background(androidx.compose.ui.graphics.Color.White, CircleShape)
            )


            var text2 by rememberSaveable { mutableStateOf("") }

            TextField(
                value = text2, onValueChange = { text2 = it },
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = null,
                        modifier = Modifier
                            .size(43.dp)
                            .padding(start = 6.dp)
                            .padding(6.dp)
                    )
                },
                label = { Text(text = "Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#F5EBE0")),
                    focusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                    unfocusedBorderColor = androidx.compose.ui.graphics.Color.Transparent,
                    textColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
                    unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e"))
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 24.dp, end = 24.dp)
                    .background(androidx.compose.ui.graphics.Color.White, CircleShape)
            )

            Image(painter = painterResource(id = R.drawable.arrow_right), contentDescription = null,
                modifier = Modifier
                    .width(80.dp)
                    .padding(top = 24.dp)
                    .align(Alignment.End)
                    .clickable { }
                    .padding(end = 24.dp)
            )

            Text(
                text = "Forget your password? Recovery it",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color(android.graphics.Color.parseColor("#000000"))
            )

        }
    }