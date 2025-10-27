package com.universidad.gymclass

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Application class para GymClass
 * Configuración inicial con Hilt para Dependency Injection
 */
@HiltAndroidApp
class GymClassApplication : Application() {
    
    override fun onCreate() {
        super.onCreate()
        
        // Configuraciones iniciales si es necesario
        initializeFirebase()
        setupNotificationChannels()
    }
    
    private fun initializeFirebase() {
        // Firebase se inicializa automáticamente con google-services.json
        // Configuraciones adicionales si es necesario
    }
    
    private fun setupNotificationChannels() {
        // Configuración de canales de notificación
        // Se implementará en el módulo de notificaciones
    }
}