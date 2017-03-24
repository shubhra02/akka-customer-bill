package com.knoldus

import akka.actor.{Actor, Props}

class BillGeneratorActor extends Actor{

  val phoneBillHandler = context.actorOf(PhoneBillHandler.props)
  val electricBillHandler = context.actorOf(ElectricityBillHandler.props)
  val internetBillHandler = context.actorOf(InternetBillHandler.props)

  override def receive = {
    case (user: String, phoneBill: Bills) => if(phoneBill.billerCategory == "phone")
                              phoneBillHandler ! (user,phoneBill)
    case (user: String, electricBill: Bills) => if(electricBill.billerCategory == "electricity")
                                electricBillHandler ! (user, electricBill)
    case (user: String, internetBill: Bills) => if(internetBill.billerCategory == "internet")
                                internetBillHandler ! (user, internetBill)
    }

}

object BillGeneratorActor{
  def props = Props[BillGeneratorActor]
}