package com.example.mrbugger_app.ui.screen.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mrbugger_app.R
import com.example.mrbugger_app.ui.components.CategoryBar
import com.example.mrbugger_app.ui.components.LogoAndCard
import com.example.mrbugger_app.ui.components.PromoBanner
import com.example.mrbugger_app.ui.theme.PrimaryYellowLight
import com.example.mrbugger_app.ui.theme.Wight
import com.example.mrbugger_app.ui.theme.gray


@Composable
fun homePage(){
    var search by remember { mutableStateOf("") }
   Column(
       modifier = Modifier
           .fillMaxWidth()
           .background(Color.White)
           .padding(16.dp)
   ) {
       Spacer(modifier = Modifier.height(16.dp))
       //logo and profile image
       LogoAndCard()
       Spacer(modifier = Modifier.height(2.dp))
       // Search Bar
       Searchbar(search = search, onSearchChange = { search = it })
       Spacer(modifier = Modifier.height(16.dp))
       // Category Bar
       CategoryBar()
       Spacer(modifier = Modifier.height(16.dp))
       //Promotion Banner
       PromoBanner()
       Spacer(modifier = Modifier.height(16.dp))

       // Food Item Grid
       FoodGrid()

   }
}

@Composable
fun Searchbar(search: String, onSearchChange: (String) -> Unit) {
    com.example.mrbugger_app.ui.components.SearchBar(search = search, onSearchChange = onSearchChange)
}


@Composable
fun FoodGrid() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        repeat(2){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
               repeat(2) {
                   Box(modifier = Modifier
                       .padding(8.dp)
                       .size(150.dp)
                       .background(Color.LightGray, shape = RoundedCornerShape(8.dp)))

               }

            }
        }

    }
}





@Preview
@Composable
fun PreviewHomePage(){
    homePage()
}