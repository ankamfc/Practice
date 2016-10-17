/** Priority Queue implementation based on Min-Heap */
public class PriorityQueue {
 
    private final int MAX_SIZE;
    private static final int DEFAULT_SIZE = 1024;
    private static final int ROOT = 1;
    private static final int NULL = -1;
    private int[ ] array;
    private int lastIndex = ROOT;
 
    /** Constructs a priority queue with the specified size */
    public PriorityQueue( int size ) {
        MAX_SIZE = size;
        array = new int[ MAX_SIZE ];
        java.util.Arrays.fill( array, NULL );
    }
 
    /** Constructs a priority queue with the default size */
    public PriorityQueue() {
        this( DEFAULT_SIZE );
    }
 
    /** Adds a new element to the array while maintaining the min-heap property */
    public void add( int element ) {
        if( element < 0 || lastIndex == MAX_SIZE ) {
            return;
        }
 
        int elementIndex = lastIndex++;
        array[ elementIndex ] = element;
 
        while( array[ elementIndex ] < array[ parent( elementIndex ) ] ) {
            swap( elementIndex, parent( elementIndex ) );
            elementIndex = parent( elementIndex );
        }
    }
 
    /** Returns the parent index */
    private int parent( int index ) {
        return index / 2;
    }
 
    /** Returns the left child index */
    private int leftChild( int index ) {
        return 2 * index;
    }
 
    /** Returns the right child index */
    private int rightChild( int index ) {
        return 2 * index + 1;
    }
 
    /** Returns the smallest child index */
    private int minChild( int index ) {
 
        int leftChildIndex = leftChild( index );
        int rightChildIndex = rightChild( index );
 
        if( leftChildIndex >= MAX_SIZE && rightChildIndex >= MAX_SIZE ) return NULL;
        else if( rightChildIndex >= MAX_SIZE ) return leftChildIndex;
 
        if( array[ leftChildIndex ] == NULL && array[ rightChildIndex ] == NULL ) return NULL;
        else if( array[ rightChildIndex ] == NULL ) return leftChildIndex;
 
        return array[ leftChildIndex ] <= array[ rightChildIndex ] ? leftChildIndex : rightChildIndex;	
    }
 
    /** Returns the minimum element from the heap */
    public int min() {
        return array[ ROOT ];
    }
 
    /** Returns and removes the minimum element from the heap */
    public int removeMin() {
 
        int rootElement = array[ ROOT ];
        int elementIndex = --lastIndex;
        int element = array[ elementIndex ];
 
        array[ ROOT ] = element;
        array[ elementIndex ] = NULL;
        elementIndex = ROOT;
 
        for( int minChildIndex; ( ( minChildIndex = minChild( elementIndex ) ) != NULL ) 
            && ( array[ elementIndex ] > array[ minChildIndex ] ); ) {
 
            swap( elementIndex, minChildIndex );
            elementIndex = minChildIndex;			
        }
 
        return rootElement;
    }
 
    /** Checks if the heap is empty */
    public boolean isEmpty( ) {
        return lastIndex == ROOT;
    }
 
    /** Helper method for swapping elements in the array */
    private void swap( int a, int b ) {
        int temp = array[ a ];
        array[ a ] = array[ b ];
        array[ b ] = temp;
    }
 
    @Override
    public String toString( ) {
        StringBuffer sb = new StringBuffer( "[" );
        for( int i = 1; i < lastIndex; i++ ) {
            sb.append( array[ i ] );
            if( i + 1 < lastIndex ) sb.append( ", " );
        }
        sb.append( "]" );
        return sb.toString( );
    }
}
