package s1;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f42682a = j.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e8) {
            j.c().b(f42682a, "Trouble instantiating + " + str, e8);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
