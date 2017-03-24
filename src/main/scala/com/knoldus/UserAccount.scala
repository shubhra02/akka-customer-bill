package com.knoldus


case class UserAccount (
                       holderName: String,
                       accountNumber: Int,
                       address: String,
                       userName: String,
                       initialAmount: Double = 0
                       )
