package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.GreetingCardTheme

class MainActivityBusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImageAuthor()
                    ContactList()
                }
            }
        }
    }
}

@Composable
fun ImageAuthor() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color(0xFFFFFFFF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        val image = painterResource(R.drawable.user)
        val phone = painterResource(R.drawable.phone)
        val nn = painterResource(R.drawable.tg)
        val email = painterResource(R.drawable.emai)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.height(150.dp)
        )
        Text(
            text = stringResource(R.string.my_name),
            modifier = Modifier.padding(top = 34.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.descr),
            fontSize = 16.sp
        )

        Column(
            modifier = Modifier
                .padding(top = 150.dp, start = 50.dp)
                .height(200.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xFFFFFFFF)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = phone,
                    contentDescription = null,
                    modifier = Modifier
                        .height(40.dp)
                        .padding(end = 10.dp)
                )
                Text(
                    text = stringResource(R.string.phone),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify
                )
            }
            Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = nn,
                    contentDescription = null,
                    modifier = Modifier
                        .height(40.dp)
                        .padding(end = 10.dp)
                )
                Text(
                    text = stringResource(R.string.tg),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify
                )
            }
            Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = email,
                    contentDescription = null,
                    modifier = Modifier
                        .height(40.dp)
                        .padding(end = 10.dp)
                )
                Text(
                    text = stringResource(R.string.email),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify
                )
            }

        }
    }
}

@Composable
fun ContactList() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color(0xFFF6EDFF)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)

    {
        Row(modifier = Modifier.fillMaxWidth()){
            val image = painterResource(R.drawable.ic_launcher_foreground)
            Image(painter = image, contentDescription = null)
            Text( text = "1")
        }
        Row(){
            val image = painterResource(R.drawable.ic_launcher_foreground)
            Image(painter = image, contentDescription = null);
            Text( text = "2")
        }
        Row(){
            val image = painterResource(R.drawable.ic_launcher_foreground)
            Image(painter = image, contentDescription = null)
            Text( text = "3")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ImageAuthorPreview() {
    GreetingCardTheme {
        ImageAuthor()
    }
}