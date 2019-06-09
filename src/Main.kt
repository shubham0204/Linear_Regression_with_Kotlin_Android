import java.util.*

fun main(){

    val regressor = Regressor( 2 )
    regressor.fit( arrayOf(
        doubleArrayOf( 0.0 , 0.0 ) ,
        doubleArrayOf( 0.0 , 0.0 ) ,
        doubleArrayOf( 0.0 , 0.0 ) ,
        doubleArrayOf( 0.0 , 0.0 )
    ) ,
        doubleArrayOf( 1.0 , 1.0 , 2.0 , 2.0 ) ,
        epochs = 100 ,
        batchSize = 2
    )



}

private fun batch ( x : Array<DoubleArray> , y : DoubleArray , batchSize : Int ) : List<List<Pair<DoubleArray,Double>>> {
    val data = x.zip( y.toTypedArray() )
    return data.chunked( batchSize )
}