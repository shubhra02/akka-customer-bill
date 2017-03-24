package com.knoldus

import akka.actor.{Actor, Props}

class PhoneBillHandler extends Actor{

  override def receive = {
    case bill: Bills =>
  }
}
object PhoneBillHandler{
  def props = Props[PhoneBillHandler]
}