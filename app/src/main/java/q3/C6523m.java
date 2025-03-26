package q3;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6523m implements B4.b {

    /* renamed from: d, reason: collision with root package name */
    private static final A4.c f41814d = new A4.c() { // from class: q3.l
        @Override // A4.c
        public final void a(Object obj, Object obj2) {
            int i8 = C6523m.f41815e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f41815e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f41816a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f41817b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final A4.c f41818c = f41814d;

    @Override // B4.b
    public final /* bridge */ /* synthetic */ B4.b a(Class cls, A4.c cVar) {
        this.f41816a.put(cls, cVar);
        this.f41817b.remove(cls);
        return this;
    }

    public final C6531n b() {
        return new C6531n(new HashMap(this.f41816a), new HashMap(this.f41817b), this.f41818c);
    }
}
