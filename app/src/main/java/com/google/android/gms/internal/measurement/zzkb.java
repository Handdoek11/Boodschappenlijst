package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzkb extends IOException {
    public zzkb(String str) {
        super(str);
    }

    static zzke a() {
        return new zzke("Protocol message tag had invalid wire type.");
    }

    static zzkb b() {
        return new zzkb("Protocol message contained an invalid tag (zero).");
    }

    static zzkb c() {
        return new zzkb("Protocol message had invalid UTF-8.");
    }

    static zzkb d() {
        return new zzkb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzkb e() {
        return new zzkb("Failed to parse the message.");
    }

    static zzkb f() {
        return new zzkb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static zzkb g() {
        return new zzkb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
