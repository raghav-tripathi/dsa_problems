package linklist


fun deleteBeginning(
    head: ListNode?
): ListNode? {

    if (head == null) {
        return null
    }

    return head.next
}

fun deleteEnd(
    head: ListNode?
): ListNode? {

    if (head == null || head.next == null) {
        return null
    }

    var current = head

    while (current!!.next?.next != null) {
        current = current.next!!
    }

    current.next = null

    return head
}


fun deleteAtPosition(
    head: ListNode?,
    position: Int
): ListNode? {

    if (head == null) {
        return null
    }

    if (position == 0) {
        return head.next
    }

    var current = head
    var index = 0

    while (current != null && index < position - 1) {
        current = current.next
        index++
    }

    if (current?.next == null) {
        return head
    }

    current.next = current.next?.next

    return head
}



fun deleteNode(node: ListNode?, value:Int): ListNode?{
    if(node == null){
        return null

    }

    if (node.`val` == value) {
        return node.next
    }
    var prev :ListNode? = null
    var current = node

    while(current != null){
        if(current.`val` ==  value){
            prev?.next = current.next
            return node

        }
        prev = current
        current = current.next
    }

    return node

}


fun removeNthElementFromEnd(node: ListNode?,n:Int) : ListNode?{
    val dummy = ListNode(0)
    dummy.next = node

    var slow:ListNode? = dummy
    var fast:ListNode? = dummy

    for(i in 0..n){
        fast= fast!!.next
    }

    while(fast != null){
        fast= fast.next
        slow= slow!!.next
    }

    slow?.next =  slow.next?.next


    return dummy.next

}