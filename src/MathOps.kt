
class MathOps {

    companion object {

        fun dot ( a : DoubleArray , b : DoubleArray ) : Double {
            var dotProduct = 0.0
            for( i in 0 until a.size ) {
                dotProduct += ( a[ i ] * b[ i ] )
            }
            return dotProduct
        }

        fun subtract ( a : DoubleArray , b : DoubleArray ) : DoubleArray {
            val difference = DoubleArray( a.size )
            for( i in 0 until a.size ) {
                difference[i] =  ( a[ i ] - b[ i ] )
            }
            return difference
        }

        fun multiplyScalar ( a : DoubleArray , k : Double ) : DoubleArray {
            val results = DoubleArray( a.size )
            for ( i in 0 until a.size ) {
                results[ i ] = a[ i ] * k
            }
            return results
        }

        fun multidimMean( x : Array<DoubleArray> ) : Array<Double> {
            val mean = ArrayList<Double>()
            for ( i in 0 until x[0].size ) {
                var sum = 0.0
                for ( array in x ) {
                    sum += array[i]
                }
                mean.add( sum / x.size)
            }
            return mean.toTypedArray()
        }

    }



}
