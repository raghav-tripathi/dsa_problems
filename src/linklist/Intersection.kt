package linklist

fun intersect(head1: ListNode,head2: ListNode): ListNode?{
    var  p1: ListNode? = head1
    var  p2: ListNode? = head2

    while (p1 != p2){

        p1 = if (p1 ==null){
            head2
        }else{
            p1.next
        }

        p2 = if (p2 ==null){
            head1
        }else{
            p2.next
        }

    }

    return p1
}