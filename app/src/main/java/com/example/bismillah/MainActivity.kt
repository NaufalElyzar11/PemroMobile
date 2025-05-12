package com.example.bismillah

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.*
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.draw.clip
import androidx.compose.material.BottomNavigationItem
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bismillah.ui.theme.ProfileScreen
import com.example.bismillah.ui.theme.LoginScreen
import com.example.bismillah.ui.theme.SignupScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun ImageSlider() {
    val images = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4
    )

    val pagerState = rememberPagerState { images.size }

    HorizontalPager(state = pagerState, modifier = Modifier.fillMaxWidth()) { page ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(id = images[page]),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 8.dp)
                    .clip(RoundedCornerShape(64.dp))
            )

        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { MyBottomBar(navController) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(android.graphics.Color.parseColor("#D5BDAF")))
                )
        {
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreenContent() }
            composable("profile") { ProfileScreen(navController = navController) }
            composable("login") { LoginScreen(navController = navController) }
            composable("signup") { SignupScreen(navController = navController) }
        }
    }
   }
}

@Composable
fun HomeScreenContent() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ImageSlider()
        TopCosrent()
        Spacer(modifier = Modifier.height(40.dp))
        KimetsuNoYaiba()
        Spacer(modifier = Modifier.height(40.dp))
        Frieren()
        Spacer(modifier = Modifier.height(40.dp))
    }
}

@Composable
fun TopCosrent() {
    val topStores = listOf(
        Pair("mnyauwcosu", R.drawable.store_image_1),
        Pair("yuki.cosrent", R.drawable.store_image_2),
        Pair("nekosupre.rent", R.drawable.store_image_3)
    )

    Column {
        Text("Top Cosrent", style = MaterialTheme.typography.bodyLarge)
        LazyRow {
            items(topStores) { store ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFD6CCC2)
                    ),
                    elevation = CardDefaults.cardElevation(4.dp),
                    shape = RoundedCornerShape(16.dp)
                )
                {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = store.second),
                            contentDescription = store.first,
                            modifier = Modifier
                                .size(80.dp)
                                .padding(bottom = 8.dp)
                                .clip(RoundedCornerShape(12.dp))
                        )
                        Text(
                            text = store.first,
                            style = MaterialTheme.typography.bodyMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun KimetsuNoYaiba() {
    val products = listOf(
        Pair("Kamado Tanjiro - Rp 65.000 - Man - L", R.drawable.tanjirou_image),
        Pair("Tomioka Giyuu - Rp 75.000 - Man - M", R.drawable.giyuu_image),
        Pair("Kanao - Rp 30.000 - Woman - L", R.drawable.kanao_image)
    )

    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Kimetsu No Yaiba", style = MaterialTheme.typography.bodyLarge)
            Text(
                text = "See More",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                modifier = Modifier.clickable { }
            )
        }
        LazyRow {
            items(products) { product ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFD6CCC2)
                    ),
                    elevation = CardDefaults.cardElevation(4.dp),
                    shape = RoundedCornerShape(16.dp),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(16.dp))
                    ) {
                        Image(
                            painter = painterResource(id = product.second),
                            contentDescription = product.first,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .clip(RoundedCornerShape(32.dp))
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = product.first, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Frieren() {
    val products = listOf(
        Pair("Frieren - Rp 90.000 - Woman - M", R.drawable.frieren_image),
        Pair("Fern - Rp 75.000 - Woman - M", R.drawable.fern_image),
        Pair("Stark - Rp 85.000 - Man - L", R.drawable.stark_image)
    )

    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Frieren: Beyond Journey's End", style = MaterialTheme.typography.bodyLarge)
            Text(
                text = "See More",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Black,
                modifier = Modifier.clickable {  }
            )
        }
        LazyRow {
            items(products) { product ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(150.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFD6CCC2)
                    ),
                    elevation = CardDefaults.cardElevation(4.dp),
                    shape = RoundedCornerShape(16.dp),
                    border = BorderStroke(1.dp, Color.Gray)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(16.dp))
                    ) {
                        Image(
                            painter = painterResource(id = product.second),
                            contentDescription = product.first,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .clip(RoundedCornerShape(32.dp))
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = product.first, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MyBottomBar(navController: NavController) {
    val bottomMenuItemsList = prepareBottomMenu()
    val contextForToast = LocalContext.current.applicationContext
    var selectedItem by remember { mutableStateOf("home") }

    BottomAppBar(
        modifier = Modifier.fillMaxWidth().background(Color.LightGray)
    ) {
        bottomMenuItemsList.forEach { item ->
            BottomNavigationItem(
                selected = (selectedItem == item.label),
                onClick = {
                    selectedItem = item.label
                    when (item.label) {
                        "Profile" -> navController.navigate("profile")
                        "home" -> navController.navigate("home")
                        else -> Toast.makeText(contextForToast, item.label, Toast.LENGTH_SHORT).show()
                    }
                },
                icon = {
                    Icon(
                        painter = item.icon,
                        contentDescription = item.label,
                        modifier = Modifier.size(20.dp)
                    )
                },
                label = { Text(text = item.label) },
                alwaysShowLabel = true
            )
        }
    }
}

data class BottomMenuItem(
    val label: String, val icon: Painter
)

@Composable
fun prepareBottomMenu(): List<BottomMenuItem> {
    return listOf(
        BottomMenuItem("home", painterResource(id = R.drawable.bottom_btn1)),
        BottomMenuItem("Profile", painterResource(id = R.drawable.bottom_btn2)),
        BottomMenuItem("Support", painterResource(id = R.drawable.bottom_btn3)),
        BottomMenuItem("Settings", painterResource(id = R.drawable.bottom_btn4))
    )
}





