package me.andresdiaz.tallergitgithub

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                }
            }
        }

@Preview
@Composable
fun TarjetaPresentacion() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.fotoperfil),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Andrés Felipe Diaz",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text = "Estudiante Ing.Sistemas",
                color = Color.Blue

            )

            Spacer(modifier = Modifier.height(12.dp))


            Column(
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "EDAD",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color.Gray
                )

                Text(
                    text = "18 años"
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "CORREO",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color.Gray
                )

                Text(
                    text = "adiaz277@unab.edu.co"
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "CIUDAD",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color.Gray
                )

                Text(
                    text = "Bucaramanga, Colombia"
                )
            }

            Text(
                text = ""
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1976D2),
                    contentColor = Color.White
                )
            ) {
                Text("Contacta conmigo")
            }
        }
    }
}