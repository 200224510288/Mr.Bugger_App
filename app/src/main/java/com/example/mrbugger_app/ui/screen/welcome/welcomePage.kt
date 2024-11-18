package com.example.mrbugger_app.ui.screen.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mrbugger_app.R
import com.example.mrbugger_app.ui.components.ActionButton
import com.example.mrbugger_app.ui.theme.MrBugger_AppTheme
import com.example.mrbugger_app.ui.theme.PrimaryYellowDark
import com.example.mrbugger_app.ui.theme.PrimaryYellowLight

@Composable

fun welcomePage(
    modifier: Modifier = Modifier,
){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryYellowDark,
                    0.6f to PrimaryYellowLight,
                    1f to Color.White
                )
            )
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.chef2),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,

        )

        // "Mr. Burger" Text
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 224.dp)

        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 36.sp)) {
                        append("Mr. ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 48.sp,
                            shadow = Shadow(
                                color = Color.Black,
                                blurRadius = 8f
                            )
                        )
                    ) {
                        append("Burger")
                    }
                },
                modifier = Modifier.align(Alignment.Center),
                textAlign = TextAlign.Center,
                color = Color.Black // Main text color
            )
        }

        // Buttons
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(horizontal = 24.dp)
                .padding(bottom = 61.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            ActionButton(
                text = "Login",
                isNavigationArrowVisible = true,
                onClicked = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black, // Background color
                    contentColor = PrimaryYellowLight,


                ),
                shadowColor = Color.Black,
                textSize = 25.sp,
                modifier = Modifier.fillMaxWidth()
            )
            ActionButton(
                text = "Sign Up",
                isNavigationArrowVisible = false,
                onClicked = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryYellowLight, // Background color
                    contentColor = Color.Black // Text color
                ),
                shadowColor = Color.Black,
                textSize = 25.sp,
                modifier = Modifier.fillMaxWidth()
            )

        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewWelcomePage() {
    MrBugger_AppTheme {
        welcomePage()
    }
}