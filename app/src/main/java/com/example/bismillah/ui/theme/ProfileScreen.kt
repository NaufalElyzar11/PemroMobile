package com.example.bismillah.ui.theme

import androidx.compose.runtime.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bismillah.R
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.me1),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Naufal Elyzar",
            fontSize = 26.sp,
            color = Color.Black
        )

        Text(
            text = "nopale@gmail.com",
            fontSize = 18.sp,
            color = Color.Gray
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 32.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.notif),
                    null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 5.dp)
                        .clickable { })
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Notification",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    null,
                    Modifier
                        .padding(end = 5.dp)
                        .clickable { })
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.kalender),
                    null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 5.dp)
                        .clickable { })
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Calendar",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    null,
                    Modifier
                        .padding(end = 5.dp)
                        .clickable { })
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.galeri),
                    null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 5.dp)
                        .clickable { })
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Gallery",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    null,
                    Modifier
                        .padding(end = 5.dp)
                        .clickable { })
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.wallet),
                    null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 5.dp)
                        .clickable { })
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Wallet",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    null,
                    Modifier
                        .padding(end = 5.dp)
                        .clickable { })
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.share),
                    null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 5.dp)
                        .clickable { })
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Share",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    null,
                    Modifier
                        .padding(end = 5.dp)
                        .clickable { })
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end = 32.dp, top = 10.dp, bottom = 10.dp)
                .height(55.dp)
                .clickable {
                    navController.navigate("login") {
                        popUpTo("profile") { inclusive = true }
                    }
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.log_out),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 5.dp)
                        .clickable {
                            navController.navigate("login") {
                                popUpTo("profile") { inclusive = true }
                            }
                        }
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Logout",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    val navController = rememberNavController()
    ProfileScreen(navController = navController)
}
