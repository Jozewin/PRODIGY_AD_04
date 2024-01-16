package app.joze.tictactoegame

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.joze.tictactoegame.ui.theme.Aqua
import app.joze.tictactoegame.ui.theme.GreenishYellow

@Composable
fun BoardBase() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Black,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(size.width / 3, 0f),
            end = Offset(size.width / 3, size.height)
        )
        drawLine(
            color = Color.Black,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(size.width * 2 / 3, 0f),
            end = Offset(size.width * 2 / 3, size.height)
        )
        drawLine(
            color = Color.Black,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(0f, size.height * 1 / 3),
            end = Offset(size.width, size.width * 1 / 3)
        )
        drawLine(
            color = Color.Black,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(0f, size.height * 2 / 3),
            end = Offset(size.width, size.width * 2 / 3)
        )
    }
}


@Composable
fun Cross() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp)
    ) {
        drawLine(
            color = GreenishYellow,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(0f, 0f),
            end = Offset(size.width, size.width)
        )
        drawLine(
            color = GreenishYellow,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(size.width, 0f),
            end = Offset(0f, size.height)
        )
    }
}

@Composable
fun Circle() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp)
    ) {
        drawCircle(
            color = Aqua,
            style = Stroke(width = 10f)
        )
    }
}

@Composable
fun Horizontal1() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(0f, size.height * 1 / 6),
            end = Offset(size.width, size.height * 1 / 6)
        )

    }
}

@Composable
fun Horizontal3() {
    Canvas(
        modifier = Modifier
            .size(300.dp)

    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(0f, size.height * 5 / 6),
            end = Offset(size.width, size.height * 5 / 6)
        )

    }
}

@Composable
fun Horizontal2() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(0f, size.height * 3 / 6),
            end = Offset(size.width, size.height * 3 / 6)
        )

    }
}

@Composable
fun Vertical1() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(size.width * 1 / 6, 0f),
            end = Offset(size.width * 1 / 6, size.height)
        )

    }
}

@Composable
fun Vertical2() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(size.width * 3 / 6, 0f),
            end = Offset(size.width * 3 / 6, size.height)
        )

    }
}

@Composable
fun Vertical3() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(size.width * 5 / 6, 0f),
            end = Offset(size.width * 5 / 6, size.height)
        )

    }
}

@Composable
fun Diagonal1() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(0f, 0f),
            end = Offset(size.width, size.height)
        )

    }
}

@Composable
fun Diagonal2() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
    ) {
        drawLine(
            color = Color.Red,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            end = Offset(0f, size.height),
            start = Offset(size.width,0f)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BoardBasePrev() {
    Diagonal2()
}