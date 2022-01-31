package com.jason.test01

def a = 74

switch (a) {
    case 'abc':
        print '这是第1个分支'
        break
    case [4, 7, 9]:
        print '这是第2个分支'
        break
    case 45..98:
        print '这是第3个分支'
        break
    case Integer:
        print '这是第4个分支'
        break
    case BigDecimal:
        print '这是第5个分支'
        break
    default:
        print '这是第6个分支'
        break
    
}
