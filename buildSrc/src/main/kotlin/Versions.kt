import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
  const val androidx_test_espresso: String = "3.1.1" // available: "3.2.0"

  const val com_squareup_retrofit2: String = "2.5.0" // available: "2.6.2"

  const val com_google_dagger: String = "2.21" // available: "2.25.2"

  const val com_yahoo_squidb: String = "2.0.0" // available: "3.2.3"

  const val com_jakewharton: String = "10.2.0"

  const val io_objectbox: String = "2.3.4" // available: "2.4.1"

  const val org_jacoco: String = "0.7.9"

  const val io_mockk: String = "1.9" // available: "1.9.3"

  const val android_arch_lifecycle_extensions: String = "1.1.1"

  const val com_android_tools_build_gradle: String = "3.5.2"

  const val androidx_test_runner: String = "1.2.0"

  const val androidx_test_rules: String = "1.2.0"

  const val androidx_test_core: String = "1.2.0"

  const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

  const val com_github_triplet_play_gradle_plugin: String = "2.5.0" // available: "2.6.1"

  const val kotlin_annotation_processing_gradle: String = "1.3.61"

  const val kotlin_android_extensions_runtime: String = "1.3.61"

  const val kotlin_android_extensions: String = "1.3.61"

  const val multidex_instrumentation: String = "2.0.0"

  const val javax_annotation_api: String = "1.3.2"

  const val kotlin_gradle_plugin: String = "1.3.61"

  const val logging_interceptor: String = "3.12.1" // available: "4.2.2"

  const val ink_page_indicator: String = "1.3.0"

  const val kotlin_stdlib_jdk7: String = "1.3.61"

  const val leakcanary_android: String = "2.0"

  const val constraintlayout: String = "1.1.3"

  const val mockito_android: String = "2.24.5" // available: "3.2.0"

  const val collection_ktx: String = "1.1.0"

  const val jacoco_android: String = "0.1.4"

  const val junit_jupiter: String = "5.4.2" // available: "5.5.2"

  const val ktlint_gradle: String = "9.1.1"

  const val mockwebserver: String = "3.6.0" // available: "4.2.2"

  const val xfetch2okhttp: String = "3.1.4"

  const val assertj_core: String = "3.11.1" // available: "3.14.0"

  const val core_testing: String = "2.0.1" // available: "2.1.0"

  const val fragment_ktx: String = "1.1.0"

  const val orchestrator: String = "1.1.0" // available: "1.2.0"

  const val lint_gradle: String = "26.5.2"

  const val testing_ktx: String = "1.1.1"

  const val threetenabp: String = "1.1.1" // available: "1.2.1"

  const val uiautomator: String = "2.2.0"

  const val annotation: String = "1.1.0"

  const val simple_xml: String = "2.7.1"

  const val appcompat: String = "1.1.0"

  const val rxandroid: String = "2.1.0" // available: "2.1.1"

  const val cardview: String = "1.0.0"

  const val core_ktx: String = "1.1.0"

  const val kiwixlib: String = "8.2.1"

  const val material: String = "1.1.0-beta02"

  const val multidex: String = "2.0.1"

  const val barista: String = "2.7.1" // available: "3.2.0"

  const val xfetch2: String = "3.1.4"

  const val jsr305: String = "3.0.2"

  const val ktlint: String = "0.33.0" // available: "0.36.0"

  const val okhttp: String = "3.12.1" // available: "4.2.2"

  const val rxjava: String = "2.2.5" // available: "2.2.15"

  const val aapt2: String = "3.5.2-5435860"

  const val junit: String = "1.1.1"

  /**
   * Current version: "5.6.1"
   * See issue 19: How to update Gradle itself?
   * https://github.com/jmfayard/buildSrcVersions/issues/19
   */
  const val gradleLatestVersion: String = "6.0.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
  inline get() =
    id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
