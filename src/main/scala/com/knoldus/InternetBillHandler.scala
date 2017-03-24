package com.knoldus

import akka.actor.{Actor, Props}

class InternetBillHandler extends Actor{

  override def receive = ???

}

object InternetBillHandler{
  def props = Props[InternetBillHandler]
}