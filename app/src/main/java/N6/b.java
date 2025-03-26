package N6;

import J6.r;
import java.util.Random;

/* loaded from: classes2.dex */
public final class b extends N6.a {

    /* renamed from: t, reason: collision with root package name */
    private final a f4201t = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // N6.a
    public Random h() {
        Object obj = this.f4201t.get();
        r.d(obj, "get(...)");
        return (Random) obj;
    }
}
