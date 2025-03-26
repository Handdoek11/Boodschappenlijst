package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4950k implements InterfaceC5013s {

    /* renamed from: o, reason: collision with root package name */
    private final Double f29379o;

    public C4950k(Double d8) {
        if (d8 == null) {
            this.f29379o = Double.valueOf(Double.NaN);
        } else {
            this.f29379o = d8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        return new C4950k(this.f29379o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        return this.f29379o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        if (Double.isNaN(this.f29379o.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f29379o.doubleValue())) {
            return this.f29379o.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.f29379o.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : AbstractC4941j.a(valueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        return Boolean.valueOf((Double.isNaN(this.f29379o.doubleValue()) || this.f29379o.doubleValue() == 0.0d) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4950k) {
            return this.f29379o.equals(((C4950k) obj).f29379o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29379o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        if ("toString".equals(str)) {
            return new C5029u(c());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", c(), str));
    }

    public final String toString() {
        return c();
    }
}
