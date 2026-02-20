package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCard()
                }
            }
        }
    }
}

@Composable
fun NameCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 32.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.foto_silvi),
                    contentDescription = "Foto Diri",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                        .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
                )
                Spacer(modifier = Modifier.height(24.dp))
                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Hi! My name is Silvi Fitriyani",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "4MIB",
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.secondary
                    )
                    Text(
                        text = "From Informatics Management",
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.secondary
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    NameCardTheme {
        NameCard()
    }
}
