package com.knoldus

import akka.actor.{Actor, Props}

class AccountGeneratorActor extends Actor{
  val ref = context.actorOf(AccountServiceActor.props)

  override def receive = {
    case customer: UserAccount => ref ! customer
  }

}

object AccountGeneratorActor{
  def props = Props[AccountGeneratorActor]
}