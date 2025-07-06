package com.example.businessscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businessscard.ui.theme.BusinesssCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinesssCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCardLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardLayout(modifier: Modifier = Modifier) {
    val usedIcons = Icons.Rounded
    val image = painterResource(R.drawable.android_logo)
    val fontColor = Color(0xfffaebd7)
    val usedFontSize = 16.sp
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xff4f5f76))
    ) {
        Image(
            painter = image,
            contentDescription = "Logo",
            modifier = Modifier
                .width(250.dp)
        )
        Text(
            text = "Florian Grund",
            textAlign = TextAlign.Center,
            fontSize = 32.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = fontColor,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Text(
            text = "Add some catchy headline here",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = fontColor,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
        Spacer(modifier = Modifier.height(48.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .padding(start = 48.dp)

        ) {
            Icon(
                usedIcons.Call,
                contentDescription = null,
                tint = fontColor,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text(
                text = "+49 1234567890",
                color = fontColor,
                fontSize = usedFontSize
            )

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .padding(start = 48.dp)

        ) {
            Icon(
                usedIcons.Build,
                contentDescription = null,
                tint = fontColor,
                modifier = Modifier.padding(end = 16.dp)

            )
            Text(
                text = "@AndroidDev",
                color = fontColor,
                fontSize = usedFontSize
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .padding(start = 48.dp)

        ) {
            Icon(
                usedIcons.Email,
                contentDescription = null,
                tint = fontColor,
                modifier = Modifier.padding(end = 16.dp)

            )
            Text(
                text = "Mail@mail.de",
                color = fontColor,
                fontSize = usedFontSize
            )
        }
        Spacer(modifier = Modifier.height(48.dp))
    }
}
@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun BusinessCardPreview() {
    BusinessCardLayout()
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesssCardTheme {
        Greeting("Android")
    }
}