package com.knoldus


case class Bills (
                   billerCategory: String,
                   billerName: String,
                   accountNumber: Int,
                   transactionDate: String,
                   amount: Double,
                   totalIterations: Int,
                   executedIterations: Int,
                   paidAmount: Double
                 )
