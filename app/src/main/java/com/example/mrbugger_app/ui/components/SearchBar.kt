package com.example.mrbugger_app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mrbugger_app.ui.screen.homepage.homePage
import com.example.mrbugger_app.ui.theme.PrimaryYellowLight
import com.example.mrbugger_app.ui.theme.Wight

@Composable
fun SearchBar(search: String, onSearchChange: (String) -> Unit,modifier: Modifier = Modifier){

Box(modifier = Modifier
    .fillMaxWidth()
    .padding(horizontal = 16.dp)
    .background(Wight, RoundedCornerShape(60.dp))
    .height(55.dp),
    contentAlignment = Alignment.Center
){
    TextField(value = search,
        onValueChange = onSearchChange,
        placeholder = { Text(text = "Search")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        singleLine = true,
        trailingIcon = {Icon(Icons.Default.Search, contentDescription = null)},
        textStyle = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurface),
        shape = RoundedCornerShape(60.dp),
        visualTransformation = VisualTransformation.None

        )

}


}

@Preview
@Composable
fun PreviewHomePage(){
    SearchBar(search = "", onSearchChange = {})
}