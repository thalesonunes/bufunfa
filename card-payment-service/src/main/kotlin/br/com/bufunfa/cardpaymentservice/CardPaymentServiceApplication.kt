package br.com.bufunfa.cardpaymentservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CardPaymentServiceApplication

fun main(args: Array<String>) {
	runApplication<CardPaymentServiceApplication>(*args)
}
