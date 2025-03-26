package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4975n0 implements InterfaceC5050w4 {
    UNSPECIFIED_TYPE(0),
    RAW_FILE_IO_TYPE(1),
    MOBSTORE_TYPE(2),
    SQLITE_OPEN_HELPER_TYPE(3),
    LEVEL_DB_TYPE(5),
    ROOM_TYPE(6),
    SHARED_PREFS_TYPE(7),
    PROTO_DATA_STORE_TYPE(8),
    UNRECOGNIZED(-1);


    /* renamed from: o, reason: collision with root package name */
    private final int f29472o;

    EnumC4975n0(int i8) {
        this.f29472o = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(EnumC4975n0.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5050w4
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f29472o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
