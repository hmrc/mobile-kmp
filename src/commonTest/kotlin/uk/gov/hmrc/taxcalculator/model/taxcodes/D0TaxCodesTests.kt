/*
 * Copyright 2020 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.gov.hmrc.taxcalculator.model.taxcodes

import kotlin.test.Test
import kotlin.test.assertEquals
import uk.gov.hmrc.helptosavecalculator.TaxCalculator
import uk.gov.hmrc.helptosavecalculator.model.PayPeriod.YEARLY

class D0TaxCodesTests {

    @Test
    fun `D0 Wales 100K`() {
        val calculator = TaxCalculator(
            "CD0", 100000.0, payPeriod = YEARLY, taxYear = 2019).run()
        assertEquals(40000.00, calculator.yearly.taxToPay)
        assertEquals(12608.784000000001, calculator.yearly.employersNI)
        assertEquals(5964.16, calculator.yearly.employeesNI)
    }

    @Test
    fun `D0 England 100K`() {
        val calculator = TaxCalculator(
            "D0", 100000.0, payPeriod = YEARLY, taxYear = 2019).run()
        assertEquals(40000.00, calculator.yearly.taxToPay)
        assertEquals(12608.784000000001, calculator.yearly.employersNI)
        assertEquals(5964.16, calculator.yearly.employeesNI)
    }

    @Test
    fun `D0 Scotland 100K`() {
        val calculator = TaxCalculator(
            "SD0", 100000.0, payPeriod = YEARLY, taxYear = 2019).run()
        assertEquals(21000.00, calculator.yearly.taxToPay)
        assertEquals(12608.784000000001, calculator.yearly.employersNI)
        assertEquals(5964.16, calculator.yearly.employeesNI)
    }
}
