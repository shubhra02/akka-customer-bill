package com.knoldus

import akka.actor.{Actor, Props}

class AccountServiceActor extends Actor{

  val accountData = scala.collection.mutable.Map()[String, UserAccount]
  override def receive = {
    case customer: UserAccount => accountData += (customer.userName -> customer)
    case (user: String, salary: Double) => if(accountData.contains(user)){
                                                val salaryUser = accountData(user)
                                                val newSalary = salaryUser.initialAmount + salary
                                                val newUser = salaryUser.copy(initialAmount = newSalary)
                                                accountData += (user -> newUser)
                                            }
                                            else
                                              println("Salary updation failed!!")
    case (user: String, bill:Bills) =>
  }

}

object AccountServiceActor{
  def props = Props[AccountServiceActor]
}