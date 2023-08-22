package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.test.AnimViewmodel


class MainActivity : ComponentActivity() {

    private val viewModel: AnimViewmodel by viewModels()

    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getImageId()
        setContent {
            MaterialTheme {
//                BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
//                    val itemHeight = 80.dp
//                    val transition = rememberInfiniteTransition()
//                    val xLine by transition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = with(LocalDensity.current) {
//
//                            Log.d("MainActivity", "=== maxWidth to px: ${maxWidth.toPx()}")
//                            maxWidth.toPx()
//                                                                 },
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 4000,
//                                easing = LinearEasing,
//                                delayMillis = 500
//                            )
//                        )
//                    )
//
//                    val yLine by transition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = with(LocalDensity.current) {
//                            Log.d("MainActivity", "=== itemHeight to px: ${ itemHeight.toPx()}")
//                            itemHeight.toPx() },
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 4000,
//                                easing = LinearEasing,
//                                delayMillis = 500
//                            )
//                        )
//                    )
//
//                    Log.d("MainActivity", "=== x: $xLine  y: $yLine ")
//
//                }

                BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                    val itemHeight = 80.dp
                    val itemWidth = 100.dp

                    LazyRow {
                        items(10) {
                            ProductItem(height = itemHeight, width = itemWidth)
                        }
                    }


                    FirstAnimationMovingLine()
                    SecondAnimation()


                }




//                    val transition = rememberInfiniteTransition()
//
//                    val lineOffset by transition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = 2f,
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 4000,
//                                easing = LinearEasing,
//                                delayMillis = 500
//                            )
//                        )
//                    )
//
//
//                    val canvasWidth = with(LocalDensity.current) { maxWidth.toPx() }
//                    val canvasHeight = with(LocalDensity.current) { 80.dp.toPx() }
//                    val gradientWidth = with(LocalDensity.current) { 80.dp.toPx() * 0.2f }
//                    val startX = 0f
//                    val startY = canvasHeight * lineOffset
//                    val endX = canvasWidth * lineOffset
//                    val endY = 0f
//
////                    val shimmerStartOffset = Offset(startX, startY)
////                    val shimmerEndOffset = Offset(endX, endY)
//
//                    val infiniteTransition = rememberInfiniteTransition()
//                    val xItemShimmer = infiniteTransition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = (canvasWidth + gradientWidth),
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 1300,
//                                easing = LinearEasing,
//                                delayMillis = 300
//                            ),
//                            repeatMode = RepeatMode.Restart
//                        )
//                    )
//                    val yItemShimmer = infiniteTransition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = (canvasHeight + gradientWidth),
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 1300,
//                                easing = LinearEasing,
//                                delayMillis = 300
//                            ),
//                            repeatMode = RepeatMode.Restart
//                        )
//                    )
//
//

        //        }

          //     TestMovingLine()











             //          LoadingShimmerItem(imageHeight = 100.dp, imageWidth = 120.dp)

             //   TestLoadingShimmerItem(itemHeight = 100.dp, itemWidth = 120.dp)

             //   ShimmeringImageRow()
//
//                BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
//                    val itemHeight = 80.dp
//                    val itemWidth = 100.dp
//
//                    val transition = rememberInfiniteTransition()
//
//                    val lineOffset by transition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = 2f,
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 1000,
//                                easing = LinearEasing,
//                                delayMillis = 500
//                            )
//                        )
//                    )
//
//                    val canvasWidth =  with(LocalDensity.current) {maxWidth.toPx()}
//                    val canvasHeight = with(LocalDensity.current) {itemHeight.toPx()}
//                    val startX = 0f
//                    val startY = canvasHeight * lineOffset
//                    val endX = canvasWidth * lineOffset
//                    val endY = 0f
//
//                    val startOffset = Offset(startX, startY)
//                    val endOffset = Offset(endX, endY)
//
//
//                    LazyRow {
//                        items(3) {
//                            ProductItem(
//                                height = itemHeight,
//                                width = itemWidth,
//                                startOffset = startOffset,
//                                endOffset = endOffset
//                            )
//
//                        }
//                    }
//                }


              //  drawMovingLine()


//                BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
//                    val infiniteTransition = rememberInfiniteTransition()
//                    val xItemShimmer = infiniteTransition.animateFloat(
//                        initialValue = -200f,
//                        targetValue = with(LocalDensity.current) { (maxWidth).toPx() + 80.dp.toPx()},
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 3000,
//                                easing = LinearEasing,
//                                delayMillis = 1000
//                            ),
//                            repeatMode = RepeatMode.Restart
//                        )
//                    )
//                    val yItemShimmer = infiniteTransition.animateFloat(
//                        initialValue = -200f,
//                        targetValue = with(LocalDensity.current) { -40.dp.toPx()},
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 3000,
//                                easing = LinearEasing,
//                                delayMillis = 1000
//                            ),
//                            repeatMode = RepeatMode.Restart
//                        )
//                    )
//
//                    testDraw(shimmerCoordinates = Offset(xItemShimmer.value, yItemShimmer.value))
//                }

//
//                val composableWidth = 100.dp
//                val composableHeight = 100.dp
//                BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
//                    val itemWidthPx = with(LocalDensity.current) { maxWidth.toPx() }
//                    val itemHeightPx = with(LocalDensity.current) { (composableHeight).toPx() }
//                    val gradientWidth: Float =  (0.1f * itemHeightPx)
//
//                    val infiniteTransition = rememberInfiniteTransition()
//                    val xItemShimmer = infiniteTransition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = (itemWidthPx + gradientWidth),
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 3000,
//                                easing = LinearEasing,
//                                delayMillis = 300
//                            ),
//                            repeatMode = RepeatMode.Restart
//                        )
//                    )
//                    val yItemShimmer = infiniteTransition.animateFloat(
//                        initialValue = 0f,
//                        targetValue = (itemHeightPx + gradientWidth),
//                        animationSpec = infiniteRepeatable(
//                            animation = tween(
//                                durationMillis = 3000,
//                                easing = LinearEasing,
//                                delayMillis = 300
//                            ),
//                            repeatMode = RepeatMode.Restart
//                        )
//                    )
//
//                    val shimmerCoordinates = ShimmerCoordinates(xItemShimmer.value, yItemShimmer.value)
//
//                    Log.d("MainActivity", "=== x: ${shimmerCoordinates.x}  y: ${shimmerCoordinates.y}")
//
//                    CompositionLocalProvider(LocalShimmerCoordinates provides shimmerCoordinates) {
//                        LazyRow {
//                            items(5) {
//                                TestItem(
//                                    padding = 8.dp
//                                )
//                            }
//                        }
//                    }
//                }
            }
        }
    }
}

/**
 * Working moving line
 */
@Composable
fun MovingLine() {
    val transition = rememberInfiniteTransition()

    val lineOffset by transition.animateFloat(
        initialValue = 0f,
        targetValue = 2f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 10000,
                easing = LinearEasing,
                delayMillis = 500
            )
        )
    )

    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val startX = 0f
        val startY = canvasHeight * lineOffset
        val endX = canvasWidth * lineOffset
        val endY = 0f

        drawLine(
            start = Offset(x = startX, y = startY),
            end = Offset(x = endX, y = endY),
            color = Color.Red,
            strokeWidth = 40F
        )
    }
}


@Composable
fun ProductItem(
    height: Dp,
    width: Dp,
    padding: Dp = 8.dp,
) {
    var composableSize by remember { mutableStateOf(IntSize.Zero) }
    var composableCoordinates by remember { mutableStateOf(Offset.Zero) }
    val shape = RoundedCornerShape(15)
    Box(modifier = Modifier
        .height(height)
        .width(width)
        .padding(padding)
        //  .clip(shape)
        .onGloballyPositioned { coordinates ->
            composableCoordinates = coordinates.positionInRoot()
            composableSize = coordinates.size
        }
    ) {
        Spacer(
            modifier = Modifier
                .height(height)
                .width(width)
                .background(Color.Black)
        )
    }
}

@Composable
fun drawShimmer(
    itemOffset: Offset,
    itemSize: IntSize,
    height: Dp,
    width: Dp,
) {

    Canvas(modifier = Modifier
        .width(width)
        .height(height)

    ) {
//        val canvasWidth = size.width
//        val canvasHeight = size.height
//        val startX = 0f
//        val startY = canvasHeight * lineOffset
//        val endX = canvasWidth * lineOffset
//        val endY = 0f

        val canvasWidth = size.width
        val canvasHeight = size.height
        val startX = itemOffset.x + width.toPx()
        val startY = itemOffset.y
        val endX = itemOffset.x 
        val endY = itemOffset.y + height.toPx()

        drawLine(
            start = Offset(x = startX, y = startY),
            end = Offset(x = endX, y = endY),
            color = Color.Red,
            strokeWidth = 10F
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun PreviewDrawShimmer() {
//    drawShimmer(itemOffset = Offset(0f,0f),
//        itemSize = IntSize(width = 100, height = 80),
//        height = 80.dp,
//        width = 100.dp
//    )
//}



//@Composable
//fun MovingLine(
//    shimmerStartOffset: Offset,
//  //  shimmerEndOffset: Offset,
////    itemOffset: Offset,
//    itemWidth: Dp,
//    itemHeight: Dp,
//    gradientWidth: Float
//) {
//    val transition = rememberInfiniteTransition()
//
//    val lineOffset by transition.animateFloat(
//        initialValue = 0f,
//        targetValue = 2f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(
//                durationMillis = 4000,
//                easing = LinearEasing,
//                delayMillis = 500
//            )
//        )
//    )
//
//
//    Canvas(modifier = Modifier
//        .height(itemHeight)
//        .width(itemWidth)
//    ) {
//        val canvasWidth = size.width
//        val canvasHeight = size.height
//        val startX = 0f
//        val startY = canvasHeight * lineOffset
//        val endX = canvasWidth * lineOffset
//        val endY = 0f
//
////        drawLine(
////            start = Offset(x = startX, y = startY),
////            end = Offset(x = endX, y = endY),
////            color = Color.Red,
////            strokeWidth = 40F
////        )
//
//        drawLine(
//            start = Offset(x = shimmerStartOffset.x , y = shimmerStartOffset.y ),
//            end = Offset(x = shimmerStartOffset.x - gradientWidth , y = shimmerStartOffset.y - gradientWidth),
//            color = Color.Red,
//            strokeWidth = 40F
//        )
//    }
//}

@Composable
fun FirstAnimationMovingLine() {
    val transition = rememberInfiniteTransition()

    val lineOffset by transition.animateFloat(
        initialValue = 0f,
        targetValue = 0.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 5000,
                easing = LinearEasing,
            )
        )
    )

    Canvas(
        modifier = Modifier
            .padding(
                start = 8.dp,
                top = 8.dp
            )
            .fillMaxSize()
            .border(
                width = 1.dp, color = Color.Green
            )
    ) {

        val canvasWidth = size.width
        val canvasHeight = size.height
        val startX = 0f
        val startY = (canvasHeight) * 0.83f * lineOffset
        val endX = canvasWidth * 2.2f * lineOffset
        val endY = 0f

        drawLine(
            start = Offset(x = startX, y = startY),
            end = Offset(x = endX, y = endY),
            color = Color.White,
            strokeWidth = 40F
        )
    }
}


@Composable
fun SecondAnimation() {
    val transition = rememberInfiniteTransition()

    val lineOffset by transition.animateFloat(
        initialValue = 0.1f,
        targetValue = 0.4f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 5000,
                easing = LinearEasing,
                delayMillis = 5000
            )
        )
    )

    Canvas(
        modifier = Modifier
            .padding(
                start = 8.dp,
                top = 8.dp
            )
            .fillMaxSize()
            .border(
                width = 2.dp, color = Color.Blue
            )
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val startX = (canvasWidth * 2.2f * lineOffset) - 84.dp.toPx()
        val startY = (80.dp.toPx()) * 0.80f
        val endX = canvasWidth * 2.2f * lineOffset
        val endY = 0f
        drawLine(
            start = Offset(x = startX , y = startY),
            end = Offset(x = endX, y = endY),
            color = Color.White,
            strokeWidth = 40F
        )
    }
}