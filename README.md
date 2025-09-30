# Microservices Architecture Project

Bu proje, mikroservis mimarisi kullanılarak geliştirilmiş bir örnek sistemdir. Her servis bağımsız olarak yapılandırılmış ve Swagger ile API dokümantasyonu sağlanmıştır.

## İçerik

### 1. API Gateway
- **Dizin:** `api-gateway`
- **Açıklama:** Servisler arası yönlendirme işlemlerini gerçekleştiren giriş noktasıdır. 
- **Özellikler:**
  - Routing
  - Load Balancing
  - Swagger UI Gateway entegrasyonu

### 2. Inventory Service
- **Dizin:** `inventory-service`
- **Açıklama:** Ürün envanterinin yönetildiği servistir.
- **Özellikler:**
  - Envanter sorgulama
  - Stok güncelleme
  - Swagger dokümantasyonu

### 3. Order Service
- **Dizin:** `order-service`
- **Açıklama:** Sipariş oluşturma ve yönetme işlemlerini sağlar.
- **Özellikler:**
  - Sipariş oluşturma
  - Sipariş listeleme
  - Swagger dokümantasyonu

### 4. Product Service
- **Dizin:** `product-service`
- **Açıklama:** Ürün bilgilerini yöneten servistir.
- **Özellikler:**
  - Ürün ekleme/güncelleme
  - Ürün listeleme
  - Swagger dokümantasyonu

---

## Çalıştırma Talimatları

> Her servis bağımsız olarak çalıştırılabilir. Aşağıda genel kurulum adımları verilmiştir:

### 1. Gereksinimler
- Java 17+
- Maven veya Gradle
- Docker (opsiyonel, container kullanımı için)

### 2. Projeyi Klonlayın
```bash
git clone <repo-link>
cd <repo-dizini>
