package C4;

import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d implements B4.b {

    /* renamed from: e, reason: collision with root package name */
    private static final A4.c f1067e = new A4.c() { // from class: C4.a
        @Override // A4.c
        public final void a(Object obj, Object obj2) {
            d.l(obj, (A4.d) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final A4.e f1068f = new A4.e() { // from class: C4.b
        @Override // A4.e
        public final void a(Object obj, Object obj2) {
            ((A4.f) obj2).b((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final A4.e f1069g = new A4.e() { // from class: C4.c
        @Override // A4.e
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (A4.f) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f1070h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f1071a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f1072b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private A4.c f1073c = f1067e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1074d = false;

    class a implements A4.a {
        a() {
        }

        @Override // A4.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f1071a, d.this.f1072b, d.this.f1073c, d.this.f1074d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // A4.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements A4.e {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f1076a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f1076a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // A4.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, A4.f fVar) {
            fVar.b(f1076a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f1068f);
        p(Boolean.class, f1069g);
        p(Date.class, f1070h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, A4.d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, A4.f fVar) {
        fVar.d(bool.booleanValue());
    }

    public A4.a i() {
        return new a();
    }

    public d j(B4.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z7) {
        this.f1074d = z7;
        return this;
    }

    @Override // B4.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, A4.c cVar) {
        this.f1071a.put(cls, cVar);
        this.f1072b.remove(cls);
        return this;
    }

    public d p(Class cls, A4.e eVar) {
        this.f1072b.put(cls, eVar);
        this.f1071a.remove(cls);
        return this;
    }
}
