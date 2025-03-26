package m5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    private static final List f39195e = Arrays.asList("grocery", "shopping list");

    /* renamed from: a, reason: collision with root package name */
    private final String f39196a;

    /* renamed from: b, reason: collision with root package name */
    private final p f39197b;

    /* renamed from: c, reason: collision with root package name */
    private final List f39198c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39199d;

    public j(String str, p pVar) {
        this.f39196a = str;
        this.f39197b = pVar;
        this.f39199d = o.c(str);
    }

    public void a(String str) {
        if (this.f39199d && o.b(str)) {
            this.f39198c.add(str);
        }
    }

    public List b() {
        return this.f39198c.isEmpty() ? f39195e : this.f39198c;
    }
}
