package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
class t {

    /* renamed from: c, reason: collision with root package name */
    private static final t f31896c = new t(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f31897a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f31898b;

    private t(Long l8, TimeZone timeZone) {
        this.f31897a = l8;
        this.f31898b = timeZone;
    }

    static t c() {
        return f31896c;
    }

    Calendar a() {
        return b(this.f31898b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l8 = this.f31897a;
        if (l8 != null) {
            calendar.setTimeInMillis(l8.longValue());
        }
        return calendar;
    }
}
