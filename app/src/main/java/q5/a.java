package Q5;

import J6.r;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f4705a = DesugarTimeZone.getTimeZone("GMT");

    public static final b a(Long l8) {
        Calendar calendar = Calendar.getInstance(f4705a, Locale.ROOT);
        r.b(calendar);
        return c(calendar, l8);
    }

    public static /* synthetic */ b b(Long l8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l8 = null;
        }
        return a(l8);
    }

    public static final b c(Calendar calendar, Long l8) {
        r.e(calendar, "<this>");
        if (l8 != null) {
            calendar.setTimeInMillis(l8.longValue());
        }
        return new b(calendar.get(13), calendar.get(12), calendar.get(11), d.f4733s.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), c.f4723s.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis());
    }
}
