/*
 * Developed by Ji Sungbin 2024.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/Talk/blob/main/LICENSE
 */

package app.talk

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    @Suppress("SetTextI18n")
    setContentView(TextView(this).apply { text = "Hello, World!" })
  }
}
