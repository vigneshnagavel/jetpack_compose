package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirstcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstcomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Task()
                }
            }
        }
    }
}

@Composable
fun Task(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        JetLogo()
        Name("Vignesh Nagavel")
        Emoji()
        ComposeName("Jetpack Compose")
    }
}

@Composable
fun JetLogo(){
    val image = painterResource(id = R.drawable.jetlogo )
    Image(painter = image , contentDescription  = "Jetpack Compose Logo" ,
    modifier = Modifier.size(300.dp).padding(top = 50.dp))
}
@Composable
fun Name(name : String) {
    Text(text = name,
    fontSize = 30.sp,
    fontWeight = FontWeight.Bold,
    color = Color(56, 112, 179, 255)
    )
}
@Composable
fun Emoji(){
    val image = painterResource(id = R.drawable.emojilove )
    Image(painter = image , contentDescription  = "Love Emoji" ,
    modifier = Modifier.size(150.dp))
}
@Composable
fun ComposeName(name : String) {
    Text(text = name,
    fontSize = 30.sp,
    fontWeight = FontWeight.Bold,
    color = Color(8, 48, 66, 255))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstcomposeTheme {
        Task()
    }
}
