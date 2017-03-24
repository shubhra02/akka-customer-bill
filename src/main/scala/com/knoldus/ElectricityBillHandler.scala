package com.knoldus

import akka.actor.{Actor, Props}

class ElectricityBillHandler extends Actor{

  override def receive = ???

}
object ElectricityBillHandler{
  def props = Props[ElectricityBillHandler]
}