package com.github.stephenott.qtz.executors.script.python

import com.github.stephenott.qtz.tasks.worker.WorkerConfiguration
import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.context.annotation.Context
import java.time.Duration
import java.util.*

@ConfigurationProperties("executors.python")
@Context
class PythonExecutorWorkerConfiguration: WorkerConfiguration {
    var pythonPath: String = "python3"

    var scriptFolder: String = "/python-scripts"

    override var enabled: Boolean = true

    override var taskType: String = "script-python"

    override var workerName: String = "Python-Executor-${UUID.randomUUID()}"

    override var taskMaxZeebeLock: Duration = Duration.ofSeconds(60)

    override var maxBatchSize: Int = 1
}