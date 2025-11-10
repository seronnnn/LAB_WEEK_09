package com.example.lab_week_09.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun OnBackgroundTitleText(text: String) {
    TitleText(text = text, color =
        MaterialTheme.colorScheme.onBackground)
}

@Composable
fun TitleText(text: String, color: Color){
    Text(text = text, style =
    MaterialTheme.typography.titlelarge, color = color)
}

@Composable
fun OnBackgroundItemText(text: String){
    ItemText(text = text, color =
    MaterialTheme.colorScheme.onBackground)
}

@Composable
fun ItemText(text: String, color: Color){
    Text(text = text, style =
        MaterialTheme.typography.bodySmall, color = color)
}

@Composable
fun PrimaryTextButton(text: String, onClick: () -> Unit) {
    TextButton(text = text,
        textColor = Color.White,
        onClick = onClick
    )
}

@Composable
fun TextButton(text: String, textColor: Color, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.padding(8.dp),
        colors = ButtonDefaults
            .buttonColors(
                containerColor = Color.DarkGray,
                contentColor = textColor
            )
    ) {
        Text(text = text, style =
            MaterialTheme.typography.labelMedium)
    }
}