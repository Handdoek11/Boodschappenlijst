package m7;

import i7.j;
import i7.k;

/* loaded from: classes2.dex */
public final class F implements n7.d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f39410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39411b;

    public F(boolean z7, String str) {
        J6.r.e(str, "discriminator");
        this.f39410a = z7;
        this.f39411b = str;
    }

    private final void d(i7.f fVar, Q6.b bVar) {
        int g8 = fVar.g();
        for (int i8 = 0; i8 < g8; i8++) {
            String h8 = fVar.h(i8);
            if (J6.r.a(h8, this.f39411b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + bVar + " has property '" + h8 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(i7.f fVar, Q6.b bVar) {
        i7.j e8 = fVar.e();
        if ((e8 instanceof i7.d) || J6.r.a(e8, j.a.f36734a)) {
            throw new IllegalArgumentException("Serializer for " + bVar.a() + " can't be registered as a subclass for polymorphic serialization because its kind " + e8 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f39410a) {
            return;
        }
        if (J6.r.a(e8, k.b.f36737a) || J6.r.a(e8, k.c.f36738a) || (e8 instanceof i7.e) || (e8 instanceof j.b)) {
            throw new IllegalArgumentException("Serializer for " + bVar.a() + " of kind " + e8 + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // n7.d
    public void a(Q6.b bVar, I6.l lVar) {
        J6.r.e(bVar, "baseClass");
        J6.r.e(lVar, "defaultDeserializerProvider");
    }

    @Override // n7.d
    public void b(Q6.b bVar, Q6.b bVar2, g7.b bVar3) {
        J6.r.e(bVar, "baseClass");
        J6.r.e(bVar2, "actualClass");
        J6.r.e(bVar3, "actualSerializer");
        i7.f descriptor = bVar3.getDescriptor();
        e(descriptor, bVar2);
        if (this.f39410a) {
            return;
        }
        d(descriptor, bVar2);
    }

    @Override // n7.d
    public void c(Q6.b bVar, I6.l lVar) {
        J6.r.e(bVar, "baseClass");
        J6.r.e(lVar, "defaultSerializerProvider");
    }
}
