package k7;

import j7.c;
import kotlinx.serialization.SerializationException;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6117b implements g7.b {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(j7.c cVar) {
        return c.a.c(cVar, getDescriptor(), 1, g7.e.a(this, cVar, cVar.z(getDescriptor(), 0)), null, 8, null);
    }

    public g7.a c(j7.c cVar, String str) {
        J6.r.e(cVar, "decoder");
        return cVar.a().d(e(), str);
    }

    public g7.h d(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        J6.r.e(obj, "value");
        return fVar.a().e(e(), obj);
    }

    @Override // g7.a
    public final Object deserialize(j7.e eVar) {
        Object obj;
        J6.r.e(eVar, "decoder");
        i7.f descriptor = getDescriptor();
        j7.c d8 = eVar.d(descriptor);
        J6.G g8 = new J6.G();
        if (d8.x()) {
            obj = b(d8);
        } else {
            obj = null;
            while (true) {
                int e8 = d8.e(getDescriptor());
                if (e8 != -1) {
                    if (e8 == 0) {
                        g8.f3547o = d8.z(getDescriptor(), e8);
                    } else {
                        if (e8 != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) g8.f3547o;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(e8);
                            throw new SerializationException(sb.toString());
                        }
                        Object obj2 = g8.f3547o;
                        if (obj2 == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        g8.f3547o = obj2;
                        obj = c.a.c(d8, getDescriptor(), e8, g7.e.a(this, d8, (String) obj2), null, 8, null);
                    }
                } else {
                    if (obj == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) g8.f3547o)).toString());
                    }
                    J6.r.c(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                }
            }
        }
        d8.c(descriptor);
        return obj;
    }

    public abstract Q6.b e();

    @Override // g7.h
    public final void serialize(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        J6.r.e(obj, "value");
        g7.h b8 = g7.e.b(this, fVar, obj);
        i7.f descriptor = getDescriptor();
        j7.d d8 = fVar.d(descriptor);
        d8.g(getDescriptor(), 0, b8.getDescriptor().a());
        i7.f descriptor2 = getDescriptor();
        J6.r.c(b8, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        d8.p(descriptor2, 1, b8, obj);
        d8.c(descriptor);
    }
}
